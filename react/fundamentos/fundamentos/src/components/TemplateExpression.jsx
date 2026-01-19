const TemplateExpression = () => {
    const name = "Pedro";

    const data = {
        age: 22,
        job: "none"
    }

  return (
    <div>
        <p>A soma é {2+2}</p>
        <h3>Bem vindo {name}</h3>
        <p>Sua idade é {data.age} e você é um {data.job}</p>
    </div>
  )
}

export default TemplateExpression