import ForumPost from "../ForumPost/ForumPost.js";
import "./ThreadPage.css";

function ThreadPage() {
    return(
        <div id="thread-page">
            <header>
                <h1>Thread Name</h1>
            </header>
            <ForumPost category="question" title="title1" body="this is body"/>
            <ForumPost category="suggestion" title="title2" body="this is body"/>
            <ForumPost category="clarification" title="title3" body="this is body"/>
            <a href="/create">Create post</a>
            <a href="../">Back</a>
        </div>
    );
}

export default ThreadPage;