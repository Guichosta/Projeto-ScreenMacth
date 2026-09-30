O projeto ScreenMatch, que estamos desenvolvendo ao longo do curso "Java: aplicando a Orientação a Objetos", tem como objetivo principal criar um sistema para gerenciar e classificar diferentes tipos de conteúdos audiovisuais, como filmes, séries e episódios.

Pense nele como um pequeno sistema de recomendação ou um catálogo inteligente. Ele busca aplicar os conceitos de Orientação a Objetos para organizar esses conteúdos de forma flexível e extensível.

Aqui estão os pontos chave do que o projeto quer desenvolver:

Modelagem de Conteúdos: Criar classes que representem diferentes tipos de mídias (Filme, Série, Episódio), capturando suas características específicas (nome, ano de lançamento, duração, etc.).
    
Reutilização de Código com Herança: Utilizar a herança para que características comuns entre os conteúdos (como Titulo para Filme e Serie) não precisem ser repetidas, promovendo a reutilização e organização do código.
    
Definição de Comportamentos Comuns com Interfaces: Através de interfaces como Classificavel, o projeto permite que diferentes tipos de conteúdos (Filme, Episódio) possam ser classificados de maneiras distintas, mas ainda assim serem tratados de forma uniforme por outras partes do sistema (como o FiltroRecomendacao). Isso é o coração do polimorfismo que estamos explorando.
    
Cálculo e Filtragem: Implementar lógicas para calcular a duração total de conteúdos (com CalculadoraDeTempo) e para filtrar recomendações baseadas em classificações (com FiltroRecomendacao).
    
Flexibilidade e Extensibilidade: O design do projeto, com o uso de interfaces e herança, visa permitir que novas categorias de conteúdo ou novas formas de classificação e cálculo possam ser adicionadas no futuro com o mínimo de alteração no código existente.
