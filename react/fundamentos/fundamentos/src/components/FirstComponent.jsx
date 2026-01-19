// 5 - hierarquia de componentes:
import MyComponent from "./MyComponent";

const FirstComponent = () =>{
    return(
        <div>
            <h2>Meu primeiro componente</h2>
            {/* 5 - hierarquia de componentes: */}
            <MyComponent></MyComponent>
        </div>
    );
}

export default FirstComponent;