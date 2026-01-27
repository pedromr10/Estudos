import "./MyForm.css";
import { useState } from "react";

const MyForm = ({userName, userEmail}) => {
    //3 - gerenciamento de dados:
    const [name, setName] = useState(userName);
    const [email, setEmail] = useState(userEmail);
    const [bio, setBio] = useState("");

    const [role, setRole] = useState("");

    const handleName = (e) =>{
        setName(e.target.value);
    }

    //5 - envio de formulario:
    const handleSubmit = (e) =>{
        e.preventDefault();
        console.log(name, email);
        //etapa de validacao
        //etapa de envio

        //7 - limpar form:
        setName("");
        setEmail("");
        setBio("");
        setRole("");
    }

    console.log(name, email, bio, role);


  return (
    <div>
        {/*1 - criando o form */}
        {/*3 - gerenciamento de dados (onChange) */}
        {/*5 - envio de formulario (onSubmit) */}
        <form onSubmit={handleSubmit}>
            <div>
                <label htmlFor="name">Nome: </label>
                {/*6 - controlled input (value) */}
                <input type="text" name="name" placeholder="Digite o seu nome..." onChange={handleName} value={name || ""}/>
            </div>
            {/*2 - label envolvendo input */}
            {/*4 - gerenciando dado com funcao inline (onChange)*/}
            <label>
                <span>E-mail:</span>
                {/*6 - controlled input */}
                <input type="text" name="email" placeholder="Digite seu e-mail..." onChange={(e)=> setEmail(e.target.value)} value={email || ""}/>
            </label>
            {/*8 - text area */}
            <label>
                <span>Bio:</span>
                <textarea name="bio" placeholder="Descrição do usuário..." onChange={(e)=>setBio(e.target.value)}></textarea>
            </label>
            {/*9 - select */}
            <label>
                <span>Funcao no sistema</span>
                <select name="role" value={role} onChange={(e) => setRole(e.target.value)}>
                    <option value="user">Usuario</option>
                    <option value="editor">Editor</option>
                    <option value="admin">Admin</option>
                </select>
            </label>
            <input type="submit" value="Enviar" />
        </form>
    </div>
  )
}

export default MyForm