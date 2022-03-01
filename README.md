# Intro


## Docker

```bash
docker run -p 7474:7474 -p 7687:7687 neo4j
```

## Data

```
CREATE (IRONMAN:MOVIE {title: 'Iron Man', director: 'Jon Favreau'})
CREATE (LIONKING:MOVIE {title: 'Lion King', director: 'Jon Favreau'})
CREATE (AVENGERSENDGAME:MOVIE {title: 'Avengers End Game', director: 'Anthony Russo'})

CREATE (VIJAY:USER {name: 'Vijay', age: 29})
CREATE (RADHA:USER {name: 'Radha', age: 27})

```