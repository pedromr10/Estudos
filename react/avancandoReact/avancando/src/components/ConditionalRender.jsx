const ConditionalRender = () => {

    const x = true;
    const name = "pedro";

    return (
        <div>
            {/* 7 - render condicional */}
            <h3>Isso sera exibido?</h3>
            {x && <p>Se x for true, sim!</p>}
            {/* "se isso aqui for verdade, faça isso aqui" - disse o mano do curso */}
            {/* 8 - if e else ternario: */}
            <h3>render ternario:</h3>
            {name === "pedro" ? (
                <div>
                    <p>Ola {name}</p>
                </div>
            ) : (
                <div>
                    <p>voce nao é {name}</p>
                </div>
            )}
        </div>
    )
}

export default ConditionalRender