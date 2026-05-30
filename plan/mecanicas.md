# Sistema de Progressão

A progressão do personagem é automática. Ao ganhar XP suficiente, o personagem sobe de nível e seus atributos evoluem sem intervenção do jogador.

## Atributos

- **Vida** — HP do personagem. Quando chega a 0, o personagem morre.
- **Mana** — Recurso utilizado para ativar habilidades mágicas.
- **Força** — Determina o dano causado em ataques físicos.
- **Defesa** — Reduz o dano recebido em ataques inimigos.
- **Agilidade** — Influencia a ordem de ação no turno, chance de crítico e chance de esquiva.
- **Poder Mágico** — Determina o dano causado por ataques e habilidades mágicas.

## Progressão por Raça

### Povos Livres

| Raça | Perfil | Atributos Prioritários | Pontos Fortes | Pontos Fracos | Estilo de Gameplay |
|------|--------|------------------------|---------------|----------------|--------------------|
| **Elfo** | Raça ágil com forte afinidade mágica e grande precisão em combate. | Agilidade, Poder Mágico, Mana | Alta velocidade, boa esquiva, forte capacidade mágica, ataques rápidos | Defesa reduzida, vida moderada | Ofensivo e veloz, focado em mobilidade, precisão e habilidades mágicas. |
| **Anão** | Raça extremamente resistente e poderosa em combate físico. | Vida, Defesa, Força | Alta resistência, grande sobrevivência, forte dano físico, excelente desempenho defensivo | Baixa agilidade, mobilidade limitada | Defensivo e resistente, focado em suportar dano e vencer batalhas prolongadas. |
| **Hobbit** | Raça pequena e ágil, especializada em evasão e sobrevivência. | Agilidade, Mana | Alta esquiva, grande velocidade, boa sobrevivência, facilidade em escapar de situações perigosas | Baixa força, defesa limitada | Furtivo e evasivo, focado em mobilidade e sobrevivência. |
| **Istari** | Raça focada no uso de magia e habilidades especiais poderosas. | Poder Mágico, Mana | Alto dano mágico, grande variedade de habilidades, forte capacidade ofensiva mágica | Defesa baixa, vida moderada, dependência de mana | Estratégico, focado no uso de magia, habilidades especiais e gerenciamento de mana. |
| **Numenoriano** | Raça equilibrada com boa capacidade física e resistência em combate. | Força, Defesa, Vida | Equilíbrio entre ataque e defesa, boa resistência, versatilidade em combate | Menor especialização, sem extremo em um atributo específico | Equilibrado e versátil, adaptável a diferentes situações de combate. |

### Forças Sombrias

| Raça | Perfil | Atributos Prioritários | Pontos Fortes | Pontos Fracos | Estilo de Gameplay |
|------|--------|------------------------|---------------|----------------|--------------------|
| **UrukHai** | Criaturas agressivas e brutais focadas em combate físico direto. | Força, Vida | Alto dano físico, grande agressividade, boa resistência | Baixa mana, pouca mobilidade, estratégia limitada | Agressivo e ofensivo, focado em ataques físicos constantes. |
| **Dragão** | Criaturas extremamente poderosas com ataques destrutivos e alta resistência. | Vida, Força, Poder Mágico | Alto dano, grande resistência, habilidades devastadoras, forte presença em combate | Baixa agilidade, habilidades de alto custo | Destrutivo e dominante, focado em dano massivo e resistência elevada. |
| **Nazgul** | Servos sombrios especializados em magia obscura e efeitos negativos. | Poder Mágico, Mana, Agilidade | Habilidades sombrias, debuffs, boa mobilidade, pressão psicológica no combate | Defesa moderada, dependência de habilidades | Focado em efeitos negativos, dano mágico e desgaste do inimigo. |
| **Balrog** | Entidades demoníacas extremamente destrutivas e resistentes. | Força, Vida, Poder Mágico | Alto dano físico e mágico, grande resistência, forte presença ofensiva | Baixa agilidade, pouca mobilidade | Extremamente ofensivo e agressivo, focado em dano massivo e pressão constante. |

## Notas Adicionais

### Progressão

| # | Lógica de Progressão |
|---|----------------------|
| 1 | O sistema de progressão será **automático**. |
| 2 | Ao subir de nível, os atributos do personagem serão aumentados automaticamente de acordo com a **raça escolhida**. |
| 3 | Cada raça possuirá uma **progressão própria**, reforçando sua identidade e estilo de gameplay. |

### Mana

| # | Lógica |
|---|--------|
| 1 | Todas as classes possuirão **Mana**. |
| 2 | Entretanto, algumas raças terão menor afinidade com habilidades mágicas e, consequentemente, possuirão **menor quantidade de Mana e Poder Mágico**. |

### Dificuldade

| # | Lógica |
|---|--------|
| 1 | Os inimigos **não evoluirão dinamicamente** junto ao jogador. |
| 2 | A progressão de dificuldade ocorrerá através da **introdução gradual** de inimigos mais poderosos ao longo do jogo, de acordo com a evolução e o incremento de nível do player. |

# Sistema de XP

## Estrutura Geral

O sistema de progressão será simplificado, focando em evolução por marcos importantes da jornada do jogador.

Ao invés de utilizar um sistema complexo baseado em grandes cálculos de experiência, a progressão ocorrerá principalmente através da derrota de inimigos importantes, mini-bosses e bosses principais.

Essa abordagem mantém o sistema:

- simples;
- coerente;
- eficiente;
- fácil de balancear;
- adequado ao escopo do projeto.

## Progressão por Combate

O jogador evoluirá ao enfrentar desafios mais difíceis ao longo da gameplay.

A progressão ocorrerá de forma gradual através de:

- derrotar inimigos;
- vencer mini-bosses;
- derrotar bosses principais;
- concluir eventos importantes.

## Inimigos Comuns

Inimigos comuns terão como objetivo:

- preparar o jogador para desafios maiores;
- contribuir parcialmente para a progressão (XP gradual);
- auxiliar no aprendizado das mecânicas de combate;
- fornecer loot e itens.

A recompensa de XP para inimigos comuns será de **5% a 15%** da experiência necessária para o próximo nível.

Exemplo: UrukHai iniciais.

## Mini-Bosses

Mini-bosses representarão desafios intermediários e concederão avanço significativo na progressão do jogador.

A recompensa de XP para mini-bosses será de **30% a 50%** da experiência necessária para o próximo nível.

Além da XP, mini-bosses poderão desbloquear:

- armas intermediárias;
- armaduras melhores;
- itens raros.

Exemplo: Nazgul, criaturas raras, inimigos especiais.

## Bosses Principais

Bosses principais concederão **100%** da experiência necessária, garantindo **level up** ao jogador.

Além da progressão, bosses poderão liberar:

- novos desafios e áreas;
- equipamentos avançados;
- artefatos poderosos;
- armas únicas;
- itens de alta raridade.

Exemplo: Balrog, Dragões, bosses centrais da campanha.

## Bosses de Evento

Bosses de evento concederão grande quantidade de XP proporcional ao progresso atual do jogador.

A recompensa poderá variar entre **50% e 75%** da experiência necessária para o próximo nível, dependendo da dificuldade e raridade do evento.

Essa abordagem mantém os eventos relevantes durante toda a gameplay sem comprometer o balanceamento da progressão principal.

Exemplo: Ancalagon, entidades lendárias, desafios opcionais.

## Ritmo da Progressão

A progressão será mais rápida no início do jogo e gradualmente mais desafiadora conforme inimigos mais fortes forem introduzidos.

A dificuldade crescerá através da introdução de criaturas mais perigosas, e não pelo aumento dinâmico de nível dos inimigos.

### Progressão por Níveis

| Níveis | Inimigos |
|--------|----------|
| 1-3 | UrukHai |
| 4-6 | Nazgul |
| 7-8 | Dragão |
| 9-10 | Balrog / Bosses |

O jogador iniciará a gameplay já inserido no contexto da narrativa principal. Os primeiros combates ocorrerão logo no início do jogo, colocando o personagem contra pequenos grupos de UrukHai, introduzindo naturalmente as mecânicas de combate, habilidades básicas, sistema de progressão e dinâmica do jogo — sem necessidade de tutorial separado.

### Recompensa de XP

| Tipo | XP Concedida |
|------|-------------|
| Inimigos comuns | 5% a 15% |
| Mini-bosses | 30% a 50% |
| Bosses de evento | 50% a 75% |
| Bosses principais | 100% (level up garantido) |

### Penalidade por Derrota

O jogador **não perderá** níveis ou progresso ao ser derrotado. Essa decisão reduz frustração e mantém o sistema mais simples e acessível.

## Ritmo de XP por Raça

Todas as raças evoluem no **mesmo ritmo** de XP. A diferença entre elas está nos atributos, habilidades e gameplay, não na velocidade de progressão.

## Fontes Extras de XP

Fontes extras de XP existirão, mas serão **raras**:

- eventos especiais;
- bosses secretos;
- NPCs lendários.

Essas fontes não são necessárias para completar a campanha principal, mas enriquecem a experiência e oferecem recompensas opcionais.

## Exibição da Barra de XP

A barra de XP será exibida de forma textual via `JOptionPane` (através da classe `InOut`), sem interface gráfica complexa.

Exemplo de exibição:

```
XP: 75%
Nível: 4
```

## Habilidades

### Habilidade Inicial

Cada raça começará com **1 habilidade básica** própria, permitindo que o jogador já comece com identidade gameplay distinta.

Exemplo:

| Raça | Habilidade Inicial |
|------|-------------------|
| Elfo | Disparo Rápido |
| Anão | Golpe Pesado |
| Hobbit | Esquiva Ágil |
| Istari | Rajada Arcana |
| Numenoriano | Golpe Preciso |

### Desbloqueio de Habilidades

O desbloqueio de habilidades ocorrerá através da progressão de níveis do personagem. Cada raça possuirá habilidades próprias, reforçando sua identidade e estilo de gameplay.

As habilidades poderão ser:

- ofensivas;
- defensivas;
- mágicas;
- físicas;
- utilitárias.

Novas habilidades serão desbloqueadas em níveis específicos:

| Nível | Habilidades |
|-------|-------------|
| 1 | Habilidade inicial |
| 3 | Habilidade especial 1 |
| 5 | Habilidade especial 2 |
| 7 | Habilidade especial 3 |
| 9 | Habilidade especial 4 |

Cada raça possuirá um conjunto limitado de habilidades principais, evitando excesso de complexidade e facilitando o balanceamento.

### Mana e Habilidades

Todas as classes possuirão Mana e habilidades especiais. Entretanto, algumas raças terão menor afinidade mágica, utilizando habilidades mais físicas ou defensivas com baixo consumo de Mana.

Raças mágicas possuem maior quantidade de Mana e Poder Mágico. Raças físicas possuem menor reserva de Mana, utilizando habilidades mais simples e físicas.

## Progressão de Equipamentos

O desbloqueio de equipamentos será vinculado principalmente à derrota de mini-bosses, bosses principais e eventos especiais. Essa abordagem reforça a sensação de conquista e mantém a progressão mais narrativa e significativa.

### Tiers de Equipamentos

| Tier | Como desbloquear |
|------|------------------|
| Inicial | Começo do jogo (já equipado) |
| Intermediário | Mini-bosses |
| Avançado | Bosses principais |
| Lendário | Eventos especiais e bosses secretos |

### Progressão Narrativa

A progressão de equipamentos ocorrerá através das conquistas do jogador ao longo da jornada, evitando dependência de lojas complexas, grind excessivo ou sistemas avançados de crafting.

## Nível Máximo e Pós-Jogo

O nível máximo é **10**. A campanha principal termina ao atingir o nível 10 e derrotar o boss final.

Entretanto, eventos secretos e conteúdo opcional continuam disponíveis no pós-jogo:

- Ancalagon (boss secreto);
- bosses secretos adicionais;
- artefatos raros da Primeira Era;
- eventos especiais.

Isso mantém o escopo controlado, mas dá a sensação de um mundo maior e oferece rejogabilidade.

## Ativação de Eventos Especiais

Eventos especiais serão ativados por **progressão + chance controlada**, não por aleatoriedade pura.

Exemplos:

- Após derrotar certos bosses → eventos podem surgir;
- Após atingir determinado nível → chance de evento especial.

Isso mantém controle narrativo, evita bugs de pacing e simplifica a implementação.

# Sistema de Níveis

## Estrutura de Níveis

O sistema de níveis define a evolução do personagem ao longo do jogo. Cada nível representa um marco de poder e progresso, desbloqueando novas capacidades e reforçando a identidade da raça escolhida.

## Nível Máximo

O nível máximo é **10**. A campanha principal termina ao atingir o nível 10 e derrotar o boss final. Eventos secretos e conteúdo opcional continuam disponíveis no pós-jogo.

## Progressão de Níveis

A progressão entre níveis ocorre através do acúmulo de XP, obtido principalmente por combate. Cada nível exige mais XP que o anterior, garantindo ritmo progressivo — rápido no início, mais lento no final.

A distribuição de inimigos por faixa de níveis é:

| Tier | Níveis | Inimigos | Foco |
|------|--------|----------|------|
| Inicial | 1-3 | UrukHai | Introdução e aprendizado |
| Intermediário | 4-6 | Nazgul | Mini-bosses e habilidades intermediárias |
| Avançado | 7-8 | Dragão | Inimigos raros e equipamentos avançados |
| Final | 9-10 | Balrog / Bosses | Bosses finais e eventos lendários |

## Aumento Automático de Atributos

**Todo** nível concede aumento automático de atributos. Os valores de progressão serão definidos durante a fase de balanceamento, seguindo o perfil de cada raça (atributos prioritários recebem incrementos maiores).

## Desbloqueio de Habilidades

Cada raça começa com **1 habilidade básica** (nível 1) e desbloqueia habilidades especiais nos níveis **3, 5, 7 e 9**, totalizando 5 habilidades por raça.

## Recuperação ao Subir de Nível

Ao subir de nível, o personagem tem **Vida e Mana completamente restauradas**. Isso recompensa a progressão, ajuda o pacing do combate e segue o padrão clássico de RPGs.

## Ritmo da Progressão

A progressão é mais rápida nos níveis iniciais e torna-se gradualmente mais desafiadora. A dificuldade cresce pela introdução de inimigos mais poderosos (tiers fixos), não por escalonamento dinâmico.

## Pós-Jogo

Após concluir a campanha principal (nível 10), o jogador pode acessar conteúdo opcional:

- Ancalagon (boss secreto);
- bosses secretos adicionais;
- artefatos raros da Primeira Era;
- eventos especiais ativados por progressão + chance controlada.

# Evolução de Atributos

## Estrutura Geral

A evolução de atributos ocorre automaticamente conforme o jogador progride. O jogador **não distribui atributos manualmente**.

A lógica central é:

```
Boss → XP → Level Up → Distribuição automática de atributos → Crescimento racial proporcional
```

Bosses concedem XP, que leva ao level up. **Quem aumenta atributos é o nível**, não o boss diretamente.

## Progressão Automática

Cada raça possui uma distribuição automática própria, reforçando sua identidade e estilo de combate. A evolução ocorre ao subir de nível, seguindo proporções raciais específicas.

## Distribuição por Tiers

O crescimento de atributos é vinculado ao **tier de progressão**, não ao nível numérico. Cada tier possui um multiplicador de crescimento que escala a evolução.

| Tier | Níveis | Multiplicador | Foco |
|------|--------|---------------|------|
| Inicial | 1-3 | +3 / +2 / +2 / +1 | Introdução e aprendizado |
| Intermediário | 4-6 | +6 / +4 / +4 / +2 | Mini-bosses e evolução moderada |
| Avançado | 7-8 | +9 / +6 / +6 / +3 | Inimigos raros e grande evolução |
| Final | 9-10 | +9 / +6 / +6 / +3 | Bosses finais e evolução elevada |

> **Nota:** Os valores do multiplicador seguem a ordem (Prioritário 1 / Prioritário 2 / Prioritário 3 / Demais atributos). Os valores exatos serão definidos durante a implementação.

## Distribuição Percentual por Raça

Cada raça possui proporções específicas que definem quais atributos evoluem com maior intensidade. A distribuição percentual permite ajustes simples de balanceamento — alterando as proporções, ajusta-se o desempenho da raça.

### Povos Livres

| Raça | Atributo 1 | Atributo 2 | Atributo 3 |
|------|------------|------------|------------|
| **Elfo** | Agilidade | Poder Mágico | Mana |
| **Anão** | Vida | Defesa | Força |
| **Hobbit** | Agilidade | Mana | — |
| **Istari** | Poder Mágico | Mana | — |
| **Numenoriano** | Força | Defesa | Vida |

## Especialização Natural

A evolução automática garante que cada raça mantenha suas características ao longo da gameplay:

- **Raças mágicas** (Istari, Elfo) — maior crescimento de Mana e Poder Mágico;
- **Raças físicas** (Anão, UrukHai) — maior crescimento de Vida, Defesa e Força;
- **Raças equilibradas** (Numenoriano) — progressão mais versátil;
- **Raças evasivas** (Hobbit) — maior crescimento de Agilidade e Mana.

## Mana como Atributo e Recurso

A Mana funciona como **atributo + recurso**:

- **Mana Máxima** — aumenta com nível e progressão racial;
- **Mana Atual** — é consumida por habilidades, magia e efeitos especiais.

Raças mágicas recebem maior crescimento de Mana. Ao subir de nível, a Mana é completamente restaurada.

## Relação entre Atributos e Gameplay

Os atributos influenciam diretamente:

- **Vida** — sobrevivência em combate;
- **Mana** — uso de habilidades e magia;
- **Força** — dano físico;
- **Defesa** — resistência a dano recebido;
- **Agilidade** — ordem de ação, chance de crítico, chance de esquiva;
- **Poder Mágico** — dano mágico e eficiência de habilidades.

## Balanceamento

Nenhuma raça possui crescimento elevado em todos os atributos. Cada personagem tem vantagens e limitações específicas, incentivando estilos diferentes de gameplay.

A distribuição percentual permite ajustes simples durante o desenvolvimento: caso uma raça esteja muito forte ou muito fraca, basta alterar as proporções de crescimento dos atributos.

## Valores Numéricos

Os valores numéricos exatos da evolução de atributos serão definidos posteriormente durante a implementação e fase de balanceamento do jogo. A documentação atual descreve apenas a lógica geral e estrutura da progressão.

# Sistema de Desbloqueio

## Estrutura Geral

O sistema de desbloqueio controla a liberação gradual de conteúdos, habilidades, equipamentos e desafios ao longo da progressão do jogador.

A progressão ocorre de forma organizada através de:

- níveis;
- bosses;
- mini-bosses;
- eventos especiais;
- tiers de progressão.

Essa abordagem mantém o avanço da gameplay constante e evita excesso de complexidade.

## Visão Geral da Progressão

| Tier | Níveis | Inimigos | Habilidades | Equipamentos |
|------|--------|----------|-------------|--------------|
| **Inicial** | 1-3 | UrukHai | Habilidade inicial + Nv 3 | Equipamentos iniciais |
| **Intermediário** | 4-6 | Nazgul | Nv 5 | Equipamentos intermediários |
| **Avançado** | 7-8 | Dragões | Nv 7 | Equipamentos avançados |
| **Final** | 9-10 | Balrog / Bosses | Nv 9 | Equipamentos lendários |

## Progressão por Tiers

### Tier Inicial (Níveis 1-3)

Focado em:

- introdução ao combate;
- primeiros inimigos;
- aprendizado das mecânicas;
- equipamentos simples;
- primeiros grupos de UrukHai.

### Tier Intermediário (Níveis 4-6)

Focado em:

- mini-bosses;
- inimigos mais resistentes;
- habilidades intermediárias;
- equipamentos aprimorados;
- primeiros Nazgul.

### Tier Avançado (Níveis 7-8)

Focado em:

- inimigos raros;
- Dragões;
- equipamentos avançados;
- habilidades poderosas;
- eventos mais difíceis.

### Tier Final (Níveis 9-10)

Focado em:

- bosses principais;
- Balrog;
- equipamentos lendários;
- habilidades finais;
- desafios de alta dificuldade.

## Desbloqueio por Nível

**Nível** é responsável por:

- aumento automático de atributos;
- novas habilidades;
- fortalecimento geral do personagem.

### Habilidades

Cada raça desbloqueia novas habilidades em níveis específicos:

- Nível 1 — habilidade básica inicial;
- Nível 3 — habilidade especial 1;
- Nível 5 — habilidade especial 2;
- Nível 7 — habilidade especial 3;
- Nível 9 — habilidade especial 4.

## Progressão da Campanha e Bosses

**Boss** é responsável por:

- equipamentos;
- novos tiers;
- novas regiões;
- progressão da campanha.

Equipamentos **não** dependem diretamente do nível — dependem dos bosses derrotados.

### Mini-Bosses

Mini-bosses desbloqueiam:

- equipamentos intermediários;
- acesso a novos desafios;
- avanço parcial de XP;
- progressão para próximos inimigos.

Exemplo: Nazgul, criaturas raras, inimigos especiais.

### Bosses Principais

Bosses principais desbloqueiam:

- equipamentos avançados;
- artefatos poderosos;
- progressão da campanha;
- acesso ao próximo tier do jogo.

Exemplo: Dragões, Balrog, bosses centrais da campanha.

### Ordem da Campanha

A progressão principal segue uma ordem crescente de dificuldade:

```
UrukHai → Nazgul → Dragões → Balrog → Eventos lendários
```

Cada etapa desbloqueia novos desafios e conteúdos gradualmente.

## Eventos Especiais

Eventos especiais representam conteúdos opcionais e desafios raros ao longo da gameplay.

Esses eventos podem desbloquear:

- equipamentos lendários;
- artefatos únicos;
- bosses secretos;
- recompensas raras;
- conteúdos pós-jogo.

### Eventos Pós-Jogo

Após concluir a campanha principal e atingir os níveis finais, o jogador pode acessar eventos opcionais especiais:

- Ancalagon;
- entidades da Primeira Era;
- bosses lendários;
- eventos secretos.

## Conteúdo Principal e Opcional

**Conteúdo Principal** — relaciona-se diretamente à campanha e progressão obrigatória:

- bosses principais;
- progressão de tiers;
- evolução do jogador.

**Conteúdo Opcional** — relaciona-se a exploração e desafios extras:

- eventos especiais;
- bosses secretos;
- artefatos raros;
- conteúdos pós-jogo.

## Objetivo do Sistema

O sistema de desbloqueio busca manter:

- sensação constante de progressão;
- evolução clara do jogador;
- recompensas significativas;
- progressão narrativa;
- simplicidade de implementação;
- coerência com o universo do jogo.