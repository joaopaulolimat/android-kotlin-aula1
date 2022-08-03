// criação de uma função
fun main() {
    //println = imprime uma linha no console
    println("Hello, world!!!")
    // a barra invertida é usada para que as aspas sejam impressas
    // \n faz quebra de linha
    println("Este texto \"quebra\" em \nduas linhas")
    // \t faz tabulação
    println("Nota: \t 10")
    
    //declaração de uma constante. 
    //A função Pair cria um par de variáveis independentes, 
    //onde a declaração dela pode ser feita de forma separadaa
    val (endereco, numero) = Pair("Paulista", 1162)
    println(endereco)
    println(numero)
}