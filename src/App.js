import React from 'react';import { useState } from 'react';
import './App.css';
import Login from "./components/Login";
import AddTrain from './components/AddTrain';
import Header from './components/Header';
import Trainlist from './components/Trainlist';
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import { Fragment } from 'react';
import Signup from './components/Signin';
import Home from './components/Home';
import Adminlogin from './components/Adminlogin';
import Book from './components/Book';
import Cancelbooking from './components/Cancelbooking';
import Addtrainconfirm from './components/Addtrainconfirm';
import Bookconfirm from './components/Bookconfirm';
import Cancelconfirm from './components/Cancelconfirm';
import Signinconfirm from './components/Signinconfirm';
import Searchtrain from './components/Searchtrain';
// import Footer from './components/Footer';
import Error from './components/Error';


function App() {
  const[trains, setTrain]=useState([]);
  const addTrainHandler = (train) => {
    console.log(train);
    setTrain([...trains, train]);
  }

  return (
    <div className='App'>

		<Header></Header>

		<Router>
			<Fragment>
				<Routes>
					<Route exact path='/' element={<Home/>}/>
					<Route exact path='/login' element={<Login/>}/> 
					<Route exact path='/signin' element={<Signup/>}/> 
					<Route exact path='/addtrain' element={<AddTrain addTrainHandler={addTrainHandler}></AddTrain>}/> 	
					<Route exact path='/trainlist' element={<Trainlist trains={trains}/>}/> 
					<Route exact path='/adminlogin' element={<Adminlogin/>}/>
					<Route exact path='/book' element={<Book/>}/>
					<Route exact path='/cancelbooking' element={<Cancelbooking/>}/>
					<Route exact path='/addtrainconfirm' element={<Addtrainconfirm/>}/>
					<Route exact path='/bookconfirm' element={<Bookconfirm/>}/>
					<Route exact path='/cancelconfirm' element={<Cancelconfirm/>}/>
					<Route exact path='/signinconfirm' element={<Signinconfirm/>}/>
					<Route exact path='/search' element={<Searchtrain/>}/>
					<Route exact path='/*' element={<Error/>}/>

				</Routes>
			</Fragment>	
		</Router>

		{/* <Footer></Footer> */}

    </div>
  );
  }
export default App;
