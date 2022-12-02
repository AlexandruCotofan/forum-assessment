import "./ForumPostCreation.css";

function ForumPostCreation() {
    const threadTitle = window.location.href.split("=")[1];

    return(
        <form className="forum-post-form" method="POST" action="http://localhost:3001/create">
            <h1>Create post:</h1>
            <label>Thread:</label>
            <input type="text" name = "title" value = {threadTitle} readonly/>
            <label>Post type:</label>
            <select name="category">
                <option value="question">Question</option>
                <option value="suggestion">Suggestion</option>
                <option value="clarification">Clarification</option>
            </select>
            <label>Post title:</label>
            <input type="text" name="post-title" required/>
            <label>Post content:</label>
            <input type="text" name="post-content" required/>
            <label>Post image (optional):</label>
            <input type="text" id="post-image"/>
            <button type="submit">Create post</button>
        </form>
    );
}

export default ForumPostCreation;