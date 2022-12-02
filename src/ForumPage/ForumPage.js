import { useState, useEffect } from "react";
import ForumThread from "../ForumThread/ForumThread.js";
import axios from "axios";

function ForumPage() {
    const [threadsArray, setThreadsArray] = useState([]);

    useEffect(() => {
        const getThreadData = async () => {
          const threadsData = await axios("http://localhost:3001");
          setThreadsArray(threadsData.data);
        };
        getThreadData();
      }, []);

    return(
        <div id="forum-page">
            <header>
                <h1>Forum</h1>
            </header>
            {threadsArray.map((thread) => (
                <ForumThread 
                key = {thread.title}
                title = {thread.title} />
            ))}
            {/* <ForumThread title="thread1" />
            <ForumThread title="thread2" />
            <ForumThread title="thread3" /> */}
        </div>
    );
}

export default ForumPage;