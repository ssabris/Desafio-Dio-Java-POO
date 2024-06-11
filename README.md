# Desafio-Dio-Java-POO
Neste repositório contém desafio Dio sobre POO em Java. Foi desenvolvida modelagem e diagrama em UML do compenente Iphone, sobre as funcionalidades do aparelho como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Mdelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), foi elaborado a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implementado as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Diagrama UML (desenvolvido no Mermaid)
```mermaid
classDiagram
    iPhone --|> ReprodutorMusical
    iPhone --|> AparelhoTelefonico
    iPhone --|> NavegadorInternet
    
    iPhone : +selecionarMusica()void
    iPhone : +pausar()void
    iPhone : +tocar()void
    iPhone : +ligar(numero String)void
    iPhone : +atender(numero String)void
    iPhone : +iniciarCorreioVoz(numero String)void
    iPhone : +exibirPagia(url String)void
    iPhone : +adicionarNovaAba(url String)void
    iPhone : +atualizarPagina()void

    class ReprodutorMusical{
      +tocar()void
      +pausar()void
      +selecionarMusica()void
    }
    class AparelhoTelefonico{
      +ligar(numero : String)void
      +atender(numero : String)void
      +iniciarCorreioVoz(numero : String)void
    }
    class NavegadorInternet{
      +exibirPagia(url : String)void
      +adicionarNovaAba(url : String)void
      +atualizarPagina()void
    } 
```
