# Santander Dev Week
RESTful API da Santander Dev Week construída em Java 17 com Spring Boot 3.

## Diagrama de Classes (Domínio da API)


```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "1..*" Feature
  User "1" *-- "1" Card
  User "1" *-- "1..*" News
```
