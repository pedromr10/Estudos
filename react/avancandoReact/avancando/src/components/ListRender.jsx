import { use, useState } from "react"

const ListRender = () => {

    const [list] = useState(["Pedro", "Alessandra", "Jiji", "Yuki", "Zeca", "Esmeralda"]);

  return (
    <div>
        <ul>
            {list.map((item)=>(
                <li>{item}</li>
            ))}
        </ul>
    </div>
  )
}

export default ListRender