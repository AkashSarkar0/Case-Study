import React from "react";
import Icon from "../images/Icon.jpg";
import { Link } from "react-router-dom";
// import '../Styles/Home.css';


const Home = ( ) => {

    const handleHome = () => {

    }
	return (
                <div className="home">
                    <div className="home__container">
                            <br></br>
                            <br></br>
                            
                            <img
                            className="home__logo"
                            src={Icon}
                            alt="Home icon"
                            />
                            <br></br>
                            <Link to={"/login"}>
                            <button type='button' onClick={handleHome} className="loginPageBtn">Log In</button>
                            </Link>
                            <Link to={"/signin"}>
                            <button type='button' onClick={handleHome} className="loginPageBtn">Sign Up</button>
                            </Link>
                            <br></br>
                            <Link to={"/search"}>
                            <button type='button' onClick={handleHome} className="loginPageBtn">Search Trains</button>
                            </Link>
                            <Link to={"/adminlogin"}>
                            <button type='button' onClick={handleHome} className="loginPageBtn">Login as ADMIN</button>
                            </Link>
                    </div>
                </div>
            );
        }

export default Home; 