Crie um novo projeto, com o nome "AV3_NomedoAluno". Ao final da prova, exporte o projeto inteiro, compacte a pasta e realize o upload através deste link no Moodle.

O objetivo deste projeto é implementar um sistema simples de cadastro de clientes de uma seguradora. A seguradora possui diversos tipos de seguros, que se dividem em duas categorias. Os seguros pessoais são de acidente de trabalho e vida, e os seguros de propriedade são de casa e veículo.

Todo cliente da seguradora possui nome, idade, sexo e uma relação de bens segurados. Utilize alguma estrutura de dados que não permita duplicidade de bens segurados, como o HashSet. 

Um seguro pessoal possui nome da apólice, dias para o vencimento, custo anual, indenização e beneficiário. No caso do seguro de acidente de trabalho, o tipo de acidente coberto deve ser discriminado (elabore uma enumeração).

Todos os seguros pessoais devem possuir um método para ajustar o custo anual em um percentual passado por parâmetro.

Todos os seguro pessoais devem possuir um método que indica se ele está próximo de vencer (menos que 180 dias).

Um seguro de propriedade possui nome da apólice, dias para o vencimento, custo anual, indenização e tipo de bem segurado (elabore uma enumeração). O seguro de veículo deve especificar o chassi do veículo. O seguro de casa deve especificar a área da residência e o bairro (elabore uma enumeração).

Todos os seguros de propriedade devem possuir um método que indica se ele está próximo de vencer (menos que 30 dias).

Todos os seguros de propriedade devem possuir um método para ajustar o custo anual em 10% caso o número de dias para o vencimento seja menor que 30.

Um Cliente deve possuir um método que indica se pelo menos 1 dos seus seguros está próximo de vencer, um método que indica o valor máximo que a seguradora teria que pagar caso todos os seus seguros sejam acionados e um método que ajusta o custo anual de todos os seus seguros.

Para demonstrar o funcionamento do seu programa utilize um cliente com uma lista de diferentes seguros. Você deve utilizar polimorfismo para tratar a lista de seguros de um cliente.
