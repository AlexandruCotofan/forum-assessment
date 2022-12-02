import { TbQuestionMark, TbPencil, TbSpeakerphone } from "react-icons/tb";
import "./ForumPost.css";

function ForumPost(props) {
  const icon =
    props.category === "question" ? (
      <TbQuestionMark size={30} />
    ) : props.category === "suggestion" ? (
      <TbPencil size={30} />
    ) : (
      <TbSpeakerphone size={30} />
    );
  return (
    <div className="forum-post">
      {icon}
      <div>
        <h2>{props.title}</h2>
        <p>{props.content}</p>
      </div>
      <div>IMG</div>
    </div>
  );
}

export default ForumPost;
