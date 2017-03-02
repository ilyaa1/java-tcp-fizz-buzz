const net = require('net');

const client = new net.Socket();

client.connect(4321, '127.0.0.1', () => {
    console.log('Connected');
    client.write('begin');
    client.write('Hello, server! Love, Client.');
    client.write('end');
});

client.on('close', () => {
    console.log('Connection closed');
});

