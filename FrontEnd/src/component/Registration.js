import React from 'react'
import { Link } from 'react-router-dom';
import './css/registation.css'

export default function Registration() {
  return (
    <div className="container">
        <form action="" method="post">
        <h2>Registration</h2>
        <div className="content">
            <div className="input-box">
                <label htmlFor="name">Full Name</label>
                <input type="text" placeholder="Enter full name" name="name" required/>
            </div>
            <div className="input-box">
                <label htmlFor="username">Username</label>
                <input type="text" placeholder="Enter username" name="uame" required/>
            </div>
            <div className="input-box">
                <label htmlFor="email">Email</label>
                <input type="email" placeholder="Enter your Email address" name="email" required />
            </div>
            <div className="input-box">
                <label htmlFor="phonenumber">phone number</label>
                <input type="tel" placeholder="Enter phone number" name="phonenumber" required/>
            </div>
            <div className="input-box">
                <label htmlFor="Password">Password</label>
                <input type="Password" placeholder="Enter password" name="name" required/>
            </div>
            <div className="input-box">
                <label htmlFor="cpassword">Confirm password</label>
                <input type="password" placeholder="confirm password" name="confirm password" required/>
            </div>
            <span className="gender-title">Gender</span>
            <div className="gender-category">
            <input type="radio" name="gender" id="male"/>
            <label htmlFor="gender">Male</label>
            <input type="radio" name="gender" id="male"/>
            <label htmlFor="gender">female</label>
            <input type="radio" name="gender" id="male"/>
            <label htmlFor="gender">other</label>
            </div>
        </div>
        <div className="button-container">
            <button type="submit">Register</button>
        </div>
        <p><Link to="/login">Already a Member?</Link></p>
        </form>
        </div>
  );
}
