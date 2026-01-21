//14 - children

const Container = ({children}) => { //tem q ser children
  return (
    <div>
        <h1>conteudo do componente pai:</h1>
        {children}
    </div>
  )
}

export default Container