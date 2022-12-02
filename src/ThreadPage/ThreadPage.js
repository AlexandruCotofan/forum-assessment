import { useState, useEffect } from "react";
import ForumPost from "../ForumPost/ForumPost.js";
import "./ThreadPage.css";
import axios from "axios";
import {Link} from 'react-router-dom';

function ThreadPage() {
  const [postsArray, setPostsArray] = useState([]);

  const threadTitle = window.location.href.split("=")[1];
  console.log(threadTitle);
  useEffect(() => {
    const getPostData = async () => {
      const postsData = await axios("http://localhost:3001/threads", {
        params: { title: threadTitle },
      });
      setPostsArray(postsData.data);
    };
    getPostData();
  }, []);

  return (
    <div id="thread-page">
      <header>
        <h1>Thread Name</h1>
      </header>
      {postsArray.map((post) => (
        <ForumPost
          key={post.title}
          category={post.category}
          title={post.title}
          body={post.body}
        />
      ))}
      <Link
        to={{
          pathname: "/create",
          search: "?title=" + threadTitle,
        }}
      >
        <p>Create post</p>
      </Link>
      <a href="../">Back</a>
    </div>
  );
}

export default ThreadPage;
