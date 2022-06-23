import React, {Component} from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import '../Styles/Signin.css';


class Signin extends Component
{
    constructor(){
        super()

        this.state={
            name: '',
            email: '',
            phoneNo: '',
            username: '',
            password: '',
            confirmPassword: ''
        }
    }
    
    changehandler1= e =>{
        this.setState({[e.target.name]: e.target.value})
    }

    submithandler1= e =>{
        e.preventDefault()
        console.log("User signed-up succesfully")
        axios.post('http://localhost:9003/user/add' , this.state)
              .then(response => {
                console.log(response)
              })
              .catch(error => {
              console.log(error)
              }) 
      }


    render() 
    {
        const {name,email,phoneNo,username,password,confirmPassword}=this.state
        return (
          <div className='ui_main_signin'>
             <h1 className="book_title">User sign-up</h1>
            
            <div className='ui_form_signin'>
              <form onSubmit={this.submithandler1}>

                <div className="input-field-signin">
                  <label for="name"><b>Name: </b></label>    
                  <input className="name" placeholder="Enter your name" type="text" name="name" value={name} onChange={this.changehandler1} />
                </div>

                <div className="input-field-signin">
                  <label for="email"><b>Email: </b></label>    
                  <input className="email" placeholder="Enter your email-id" type="text" name="email" value={email} onChange={this.changehandler1} />
                </div>

                <div className="input-field-signin">
                  <label for="phoneNo"><b>Phone number: </b></label>    
                  <input className="phoneNo" placeholder="Mention your contact no" type="text" name="phoneNo" value={phoneNo} onChange={this.changehandler1} />
                </div>

                <div className="input-field-signin">
                  <label for="username"><b>Username: </b></label>    
                  <input className="username" placeholder="Mention your unique username" type="text" name="username" value={username} onChange={this.changehandler1} />
                </div>

                <div className="input-field-signin">
                    <label for="password"><b>Password: </b></label>    
                    <input className="password" placeholder="Type a strong password" type="password" name="password" value={password} onChange={this.changehandler1} />
                </div>
                
                <div className="input-field-signin">
                  <label for="confirmPassword"><b>Confirm Password: </b></label>    
                  <input className="confirmPassword" placeholder="Re-type your above password" type="password" name="confirmPassword" value={confirmPassword} onChange={this.changehandler1} />
                </div>

         
                <button className='ui_button_signin' type="submit">Sign up !</button>
            

                <div>
                <Link to={"/signinconfirm"}>
                <button className='signinconfirmbtn' id="signinconfirmbtn">Confirm Sign-up</button>
                </Link>
                </div>

              </form>
            </div>
          </div>
      );
    };
}

export default Signin;