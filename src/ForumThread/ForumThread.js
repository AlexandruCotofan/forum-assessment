import "./ForumThread.css";
import { Link } from "react-router-dom";

function ForumThread(props) {
  return (
    <Link to={{
        pathname: '/thread',
        search: '?title=' + props.title,
      }} className="forum-thread">
        <h2>{props.title}</h2>
    </Link>
  );
}

export default ForumThread;
