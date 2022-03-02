# Intro


## Docker

```bash
docker run -p 7474:7474 -p 7687:7687 neo4j
```

## Cypher Query 

Data
```
CREATE (IRONMAN:Movie {title: 'Iron Man', director: 'Jon Favreau'})
CREATE (LIONKING:Movie {title: 'Lion King', director: 'Jon Favreau'})
CREATE (AVENGERSENDGAME:Movie {title: 'Avengers End Game', director: 'Anthony Russo'})

CREATE (VIJAY:User {name: 'Vijay', age: 29})
CREATE (RADHA:User {name: 'Radha', age: 27})

```

Relationship
```
CREATE 
(IRONMAN)-[:RATED {rating:10}]->(VIJAY),
(LIONKING)-[:RATED {rating:9}]->(VIJAY),
(AVENGERSENDGAME)-[:RATED {rating:10}]->(VIJAY),
(IRONMAN)-[:RATED {rating:9}]->(RADHA),
(LIONKING)-[:RATED {rating:8}]->(RADHA),
(AVENGERSENDGAME)-[:RATED {rating:10}]->(RADHA)
```