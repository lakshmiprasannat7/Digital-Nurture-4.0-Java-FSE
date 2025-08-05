import React from 'react';

const ListOfPlayers = () => {
  const players = [
    { name: 'Virat Kohli', score: 95 },
    { name: 'Rohit Sharma', score: 88 },
    { name: 'Jadeja', score: 67 },
    { name: 'Rahul', score: 55 },
    { name: 'Hardik Pandya', score: 74 },
    { name: 'Dhoni', score: 99 },
    { name: 'Bumrah', score: 68 },
    { name: 'Shami', score: 60 },
    { name: 'Pant', score: 84 },
    { name: 'Ashwin', score: 52 },
    { name: 'Surya Kumar', score: 90 },
  ];

  const highScorers = players.map((player, index) => (
    <li key={index}>
      {player.name}: {player.score}
    </li>
  ));

  const below70 = players.filter(player => player.score < 70).map((p, i) => (
    <li key={i}>
      {p.name}: {p.score}
    </li>
  ));

  return (
    <div>
      <h2>All Players:</h2>
      <ul>{highScorers}</ul>

      <h2>Players with score below 70:</h2>
      <ul>{below70}</ul>
    </div>
  );
};

export default ListOfPlayers;
