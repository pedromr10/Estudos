import { use, useState } from "react"

const ListRender = () => {

    const [list] = useState(["Pedro", "Alessandra", "Jiji", "Yuki", "Zeca", "Esmeralda"]);

    const [users, setUsers] = useState([//lista de objetos
        {id: 1, name: "pedro", age: 22},
        {id: 2, name: "alessandra", age: 21},
        {id: 3, name: "jij", age: 4}
    ]);

    const deleteRandom = () => {
        const randomNumber = Math.floor(Math.random() * 4);
        setUsers((prevUsers) => prevUsers.filter((user) => randomNumber !== user.id));
    }//filter é um método de arrays que serve para criar uma nova lista contendo apenas os itens que passam em uma condição.
    //estrutura basica: array.filter(item => condição)

  return (
    <div>
        {/*4 - render sem key: */}
        <ul>
            {list.map((item)=>(
                <li>{item}</li>
            ))}
        </ul>
        {/*4.1 - render caso nao ache a key (nao é recomendada, prcure sempre usar a key): */}
        <ul>
            {list.map((item, i) =>(
                <li key={i}>
                    {item}
                </li>
            ))}
        </ul>

        {/*5 - render com key: */}
        {users.map((user) =>(
            <li key={user.id}>
                {user.name} - {user.age} anos
            </li>
        ))}
        {/*6 - previous state */}
        <button onClick={deleteRandom}>Delete random user</button>
    </div>
  )
}

export default ListRender