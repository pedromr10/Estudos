    class Contabancari{
        constructor(titular, saldo){
            this.titular = titular;
            this.saldo = 0;
        }

        depositar(valor){
            if(valor<0){
                console.log("Valor negativo!");
            }
            else{
                this.saldo += valor;
            }
        }

        sacar(valor){
            if(this.saldo >= valor){
                this.saldo -= valor;
            }
            else{
                console.log("Saldo insuficiente!");
            }
        }

        mostrarSaldo(){
            console.log(`Saldo atual de ${this.titular}: R$ ${this.saldo}`);
        }
    }