import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

//1 - criando um formulario
import MyForm from './components/MyForm'

function App() {

  return (
    <>
    <div>
      <h1>Form em react</h1>
      {/*1 - criando um formulario */}
      <MyForm userName = "Pedro" userEmail = "pedromr@gmail.com"></MyForm>
    </div>

    </>
  )
}

export default App
