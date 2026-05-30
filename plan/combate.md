# Sistema de Combate

## Estrutura Geral

O sistema de combate será baseado em **turnos**, permitindo batalhas organizadas, estratégicas e compatíveis com o escopo do projeto.

Cada combate ocorrerá em ciclos de ação, onde personagens e inimigos agirão de acordo com seus atributos e condições atuais.

Essa abordagem facilita:

- implementação;
- balanceamento;
- controle das mecânicas;
- integração com o sistema de progressão.

## Estrutura de Turnos

As batalhas ocorrerão em sequência de turnos.

Durante seu turno, o jogador poderá executar **uma ação principal**.

Após a ação do jogador, os inimigos executarão suas ações conforme a ordem de combate.

## Ordem de Ação

A ordem dos turnos será definida principalmente pelo atributo **Agilidade**.

Personagens com maior Agilidade agirão antes durante o combate. Essa mecânica reforça a importância estratégica do atributo.

## Atributos no Combate

Os atributos influenciarão diretamente as batalhas.

- **Vida** — Define a quantidade de dano que o personagem pode suportar antes de ser derrotado.
- **Mana** — Define a quantidade de energia disponível para utilizar habilidades especiais e mágicas. A Mana evoluirá conforme definido no sistema de progressão e evolução de atributos.
- **Força** — Influencia o dano físico causado por ataques corpo a corpo e habilidades físicas.
- **Defesa** — Reduz parte do dano recebido durante os combates.
- **Agilidade** — Influencia ordem de turno, chance de esquiva e velocidade de combate.
- **Poder Mágico** — Influencia dano mágico, eficiência de habilidades especiais e poder de habilidades mágicas.

## Sistema de Dano

O combate utiliza fórmulas simples de dano para manter clareza, facilidade de balanceamento e implementação acessível.

### Dano Físico

```
Dano = Força + bônus da arma - Defesa inimiga
```

### Dano Mágico

```
Dano Mágico = Poder Mágico + bônus da habilidade - (Defesa inimiga / 2)
```

A Defesa influencia a resistência mágica, porém com eficiência reduzida, representando a maior dificuldade de bloquear ataques mágicos utilizando armaduras e resistência física convencional.

## Sistema de Cooldown

Cada habilidade possui **cooldown individual**. Após utilizar uma habilidade, o personagem deve aguardar a quantidade de turnos definida antes de reutilizá-la.

| Habilidade | Cooldown |
|------------|----------|
| Rajada Arcana | 3 turnos |
| Esquiva Ágil | 1 turno |
| Golpe Pesado | 2 turnos |

## Ações do Jogador

Durante o combate, o jogador poderá realizar diferentes ações.

### Ataque Básico

Ação padrão que **não consome Mana**.

### Habilidades

Habilidades especiais consomem **Mana** e possuem efeitos específicos de acordo com cada raça.

Cada personagem começa com uma habilidade básica inicial. Novas habilidades são desbloqueadas ao longo da progressão.

### Defesa

**Consome o turno inteiro.** Reduz parcialmente o dano recebido até o próximo turno.

Isso cria um trade-off estratégico: atacar ou sobreviver. Útil contra bosses, ataques carregados e múltiplos inimigos.

### Correr

Ação de **fuga** disponível durante o turno do jogador.

A chance de sucesso é baseada em **Agilidade**:

- Raças ágeis (Hobbit, Elfo) — maior chance;
- Raças lentas (Anão) — menor chance.

**Não é possível fugir de bosses principais.**

### Voar

Ação especial disponível apenas para **criaturas aéreas**. Implementada como comportamento específico de entidades capazes de voo, como Dragões e criaturas aladas.

A modelagem utiliza princípios de orientação a objetos:

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

Possíveis efeitos em combate:

- aumentar esquiva temporariamente;
- evitar dano por um turno;
- alterar ordem de ação.

### Usar Itens

O sistema de combate **não utiliza consumíveis** (poções, itens de cura, recuperação manual de Mana).

A recuperação de Vida e Mana ocorre através de:

- progressão;
- checkpoints;
- eventos principais;
- level up após bosses importantes.

## Sistema de Esquiva e Crítico

O combate possuirá mecânicas simples de:

- **esquiva** — chance de evitar dano de um ataque;
- **acerto crítico** — chance de causar dano aumentado.

A **Agilidade** influencia diretamente essas chances. Essa abordagem adiciona dinamismo sem aumentar excessivamente a complexidade do sistema.

## Inimigos

O jogador enfrentará:

- inimigos comuns;
- mini-bosses;
- bosses principais;
- bosses secretos.

Os inimigos possuem atributos e habilidades próprias de acordo com sua dificuldade e tier:

| Tipo | Habilidades |
|------|-------------|
| Inimigos comuns | Ataque básico apenas |
| Mini-bosses | Algumas habilidades especiais |
| Bosses principais | Múltiplas habilidades e padrões diferenciados |

Bosses mais avançados podem possuir:

- maior quantidade de Vida;
- habilidades especiais;
- ataques mais fortes;
- padrões de combate diferenciados.

Bosses podem alternar entre ataques básicos, utilizar habilidades especiais, realizar ações defensivas e possuir padrões diferenciados de combate.

## Progressão Durante o Combate

## Estrutura dos Combates

Os combates seguem uma estrutura padrão de **1 jogador vs. 1 a 3 inimigos**.

| Fase do Jogo | Formato |
|--------------|---------|
| Early game (níveis 1-3) | 1v2 |
| Mid game (níveis 4-6) | 1v3 |
| Bosses | 1v1 ou 1 boss + 1 suporte |

**Não** são recomendados combates 1v5+, pois complicam turnos, quebram pacing e aumentam a complexidade do código.

Exemplo inicial: pequenos grupos de UrukHai.

## Derrota

Quando a Vida do personagem chegar a **zero**, o combate será encerrado.

O jogador retornará ao último ponto seguro ou checkpoint disponível.

O sistema **não removerá** níveis ou progresso do jogador após derrota.

## Progressão Durante o Combate

Ao derrotar inimigos e bosses, o jogador receberá progresso de XP e avançará em sua evolução.

Bosses e desafios maiores concedem maior avanço de progressão.

## Balanceamento

O sistema de combate busca manter:

- clareza;
- simplicidade;
- progressão consistente;
- identidade entre as raças;
- dificuldade crescente ao longo dos tiers.

## Objetivo do Sistema

O combate busca oferecer:

- progressão estratégica;
- batalhas dinâmicas;
- sensação constante de evolução;
- desafios progressivamente maiores;
- integração com o universo e progressão narrativa do jogo.
