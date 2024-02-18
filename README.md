# Buscador de Endereço 
A aplicação busca um CEP digitado pelo usuário na api https://viacep.com.br/. Se o CEP digitado estiver nos dados da api, o programa retorna os dados do endereço desejado no terminal e salva esses dados em um arquivo json, esses dados são: logradouro, cep, bairro, complemento, bairro, localidade, uf ,ibge, gia, ddd  e siafi. Embaixo, está um diagrama simplificado das classes do projeto, infelizmente, não fiz um diagrama em uml

[![](https://mermaid.ink/img/pako:eNptj8sKgzAQRX8lzKoF_QEXBV90JRTaXdPFkIw1oImNSUuJ_nujbjury7lnMTeAMJIgg7Y3H9GhdexWcc3i5fcGlX6wND0Vh4a0P7K9KFbEZkHjzMpQ-EmgNHZhf-oqnMkiy-3Lq7dZdqHchDqU9WUjkMBAdkAl4x9hJRxcRwNxyGKU1KLvHQeul6iid-b61QIyZz0l4EeJjiqFT4sDZC32U6QklTO22bdtE5cfDc9KIQ?type=png)](https://mermaid.live/edit#pako:eNptj8sKgzAQRX8lzKoF_QEXBV90JRTaXdPFkIw1oImNSUuJ_nujbjury7lnMTeAMJIgg7Y3H9GhdexWcc3i5fcGlX6wND0Vh4a0P7K9KFbEZkHjzMpQ-EmgNHZhf-oqnMkiy-3Lq7dZdqHchDqU9WUjkMBAdkAl4x9hJRxcRwNxyGKU1KLvHQeul6iid-b61QIyZz0l4EeJjiqFT4sDZC32U6QklTO22bdtE5cfDc9KIQ)
  
# Tecnologias Utilizadas 
* [Java](https://www.java.com/pt-BR/)

# Dependências e Versões Necessárias 
O projeto foi feito utilizando a versão jdk 21 do Java.  

# Como rodar o projeto

Para rodar o projeto, recomendo utilizar uma IDE que aceite o Java, como, por exemplo, o Eclipse. O projeto também pode ser executado no terminal do Windows(powershell ou cmd) e no terminal do Linux (shell). Quando o projeto for executado, ele vai pedir que o CEP seja digitadom o CEP pode ser aceito de duas formas: 01310-200 e 01310200, qualquer valor diferente dos exemplos citados anteriormente não será aceito pelo programa e ele vai apresentar uma mensagem de erro.


