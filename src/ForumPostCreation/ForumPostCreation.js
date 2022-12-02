import "./ForumPostCreation.css";

function ForumPostCreation() {
    return(
        <form className="forum-post-form">
            <h1>Create post:</h1>
            <label>Post type:</label>
            <select name="forum-post-type">
                <option value="question">Question</option>
                <option value="suggestion">Suggestion</option>
                <option value="clarification">Clarification</option>
            </select>
            <label>Post title:</label>
            <input type="text" id="forum-post-title" required/>
            <label>Post content:</label>
            <input type="text" id="forum-post-content" required/>
            <label>Post image (optional):</label>
            <input type="text" id="forum-post-image"/>
            <button type="submit">Create post</button>
        </form>
    );
}

export default ForumPostCreation;