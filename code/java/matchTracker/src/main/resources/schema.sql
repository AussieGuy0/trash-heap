DROP TABLE IF EXISTS `match`;
DROP TABLE IF EXISTS player;
DROP TABLE IF EXISTS season;

CREATE TABLE player (
  id   INT         NOT NULL AUTO_INCREMENT,
  name VARCHAR(30) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE season (
  id    INT      NOT NULL AUTO_INCREMENT,
  start DATETIME NOT NULL,
  end   DATETIME,
  PRIMARY KEY (id)
);

CREATE TABLE `match` (
  id            INT         NOT NULL AUTO_INCREMENT,
  season_id     INT         NOT NULL,
  homePlayer_id INT         NOT NULL,
  awayPlayer_id INT         NOT NULL,
  homeTeam      VARCHAR(30) NOT NULL,
  homeTeamScore SMALLINT    NOT NULL,
  awayTeam      VARCHAR(30) NOT NULL,
  awayTeamScore SMALLINT    NOT NULL,

  PRIMARY KEY (id),

  FOREIGN KEY (season_id)
  REFERENCES season (id),

  FOREIGN KEY (homePlayer_id)
  REFERENCES player (id),

  FOREIGN KEY (awayPlayer_id)
  REFERENCES player (id)
);