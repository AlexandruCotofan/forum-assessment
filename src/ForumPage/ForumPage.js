import ForumThread from "../ForumThread/ForumThread.js";

function ForumPage() {
    return(
        <div id="forum-page">
            <header>
                <h1>Forum</h1>
            </header>
            <ForumThread title="thread1" />
            <ForumThread title="thread2" />
            <ForumThread title="thread3" />
        </div>
    );
}

export default ForumPage;