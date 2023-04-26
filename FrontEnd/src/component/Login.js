import React from 'react'
import { Link } from 'react-router-dom'
import './css/login.css'

export default function Login() {
  return (
    <div className="container">
        <form action="">
            <h1>Login</h1>
            <div className="form-group">
                <label for="">Email id</label>
                <input type="text" className="form-control" required />
            </div>
            <div className="form-group">
                <label for="">password</label>
                <input type="password" className="form-control" required />
            </div>
            <div className="row">

                <div className="col">
                    <a href>Forgot Password</a>
                </div>
                <Link to="/registration">
                    <div className="col" >
                        <a href="#!">New User</a>
                    </div>
                </Link>
            </div>
            <Link to='/dashboard'>
                <input type="submit" className="btn" value="Login"/>
            </Link>
        </form>
    </div>
  )
}
