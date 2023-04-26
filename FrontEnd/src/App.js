import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import Dashboard from './component/Dashboard';
import Login from './component/Login';
import Registration from './component/Registration';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path='/registration' exact element={<Registration />} />
        <Route path='/login' exact element={<Login />} />
        <Route path='/' exact element={<Login />} />
        <Route path='/dashboard' exact element={<Dashboard />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
