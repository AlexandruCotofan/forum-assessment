import logo from './logo.svg';
import './App.css';
import ForumPage from './ForumPage/ForumPage.js';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import ForumPostCreation from './ForumPostCreation/ForumPostCreation.js';
import ThreadPage from './ThreadPage/ThreadPage.js';

function App() {
  return (
    <div className="App">
      {/* <ForumPage />
      <a href="/create">Create post</a> */}
      <Router>
        <Routes>
          <Route path='/' exact element={<ForumPage />}/>
          <Route path='/create' exact element={<ForumPostCreation />}/>
          <Route path='/thread' exact element={<ThreadPage />}/>
        </Routes>
      </Router>
    </div>
  );
}

export default App;
