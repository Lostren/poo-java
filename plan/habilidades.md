# Sistema de Habilidades

## Estrutura Geral

O sistema de habilidades é responsável por fornecer identidade de gameplay para cada raça e ampliar as possibilidades estratégicas durante os combates.

As habilidades buscam:

- reforçar o estilo de combate das classes;
- ampliar variedade de gameplay;
- integrar progressão e combate;
- manter simplicidade de implementação.

## Estrutura das Habilidades

Cada habilidade possui:

- **Nome**
- **Descrição**
- **Efeito**
- **Custo de Mana**
- **Cooldown** (individual por habilidade)

## Quantidade de Habilidades

Todas as raças possuem **5 habilidades padronizadas**, correspondendo aos níveis de desbloqueio:

| Nível | Habilidade |
|-------|------------|
| 1 | Habilidade inicial |
| 3 | Habilidade especial 1 |
| 5 | Habilidade especial 2 |
| 7 | Habilidade especial 3 |
| 9 | Habilidade especial 4 |

## Tipos de Habilidades

| Tipo | Descrição |
|------|-----------|
| **Ataque** | Habilidades ofensivas focadas em causar dano |
| **Defesa** | Habilidades focadas em resistência e proteção |
| **Buff** | Habilidades de fortalecimento temporário |
| **Mobilidade** | Habilidades relacionadas a movimentação e evasão |

## Sistema de Mana

As habilidades utilizam **Mana** como recurso principal.

- Raças com maior afinidade mágica possuem maior quantidade de Mana, habilidades mais poderosas e maior dependência de habilidades.
- Raças físicas possuem menor custo de Mana, menor dependência mágica e foco maior em combate físico.

## Cooldown

Cada habilidade possui seu **próprio cooldown individual**, variando geralmente entre **1 a 3 turnos** conforme o poder da habilidade.

## Habilidade Inicial por Raça

| Raça | Habilidade Inicial | Descrição |
|------|-------------------|-----------|
| **Elfo** | Disparo Rápido | Ataque veloz com alta precisão |
| **Anão** | Golpe Pesado | Ataque físico com alto impacto |
| **Hobbit** | Esquiva Ágil | Aumenta evasão temporariamente |
| **Istari** | Rajada Arcana | Ataque mágico de longo alcance |
| **Numenoriano** | Investida Real | Avanço ofensivo com dano moderado |

As demais habilidades de cada raça poderão ser definidas futuramente durante a implementação e balanceamento do jogo, respeitando a identidade e estilo de combate de cada classe.

## Ação Especial: Voar()

A ação `voar()` é tratada como um **comportamento especial de criaturas aéreas**, sendo implementada apenas por entidades capazes de voo, como Dragões.

O sistema utiliza princípios de orientação a objetos para separar comportamentos específicos entre diferentes tipos de entidades:

```java
interface Voador {
    void voar();
}
```

```java
class Dragao implements Voador {
    public void voar() {
        // lógica de voo
    }
}
```

## Habilidades dos Inimigos

| Tipo | Habilidades |
|------|-------------|
| **Inimigos Comuns** | Apenas ataques básicos e ações simples |
| **Mini-bosses** | Habilidades especiais limitadas, buffs simples, ataques diferenciados |
| **Bosses** | Habilidades exclusivas, ataques especiais, mecânicas mais avançadas |

## Balanceamento

O sistema busca:

- simplicidade;
- clareza;
- identidade das classes;
- facilidade de implementação;
- equilíbrio entre combate físico e mágico.

## Limitações do Sistema

O jogo não possuirá:

- árvores complexas de habilidades;
- múltiplas especializações;
- combinações avançadas;
- sistema elemental complexo;
- quantidade excessiva de efeitos de status.

## Objetivo Final

O sistema de habilidades busca:

- tornar os combates mais estratégicos;
- reforçar identidade das raças;
- ampliar sensação de progressão;
- manter o escopo do projeto controlado e viável.
