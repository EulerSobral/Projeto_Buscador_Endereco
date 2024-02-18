# Buscador de Endereço 
A aplicação busca um CEP digitado pelo usuário na api https://viacep.com.br/. Se o CEP digitado estiver nos dados da api, o programa retorna os dados do endereço desejado, esses dados são: logradouro, cep, bairro, complemento, bairro, localidade, uf ,ibge, gia, ddd  e siafi 

flowchart TD
    A[Main] -->B(Menu) 
    B --> |cep| C{Buscador}  
    B --> |cep| D{Gera Arquivo}
    C --> E{CEP}
  
