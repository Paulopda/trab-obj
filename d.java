<!DOCTYPE html>
<html>
<head>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
      padding: 20px;
    }

    .container {
      max-width: 500px;
      margin: 0 auto;
      background-color: #ffffff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }

    h1 {
      text-align: center;
      color: #333333;
    }

    .info {
      margin-bottom: 20px;
    }

    .label {
      font-weight: bold;
      color: #666666;
    }

    .value {
      margin-left: 10px;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>Venda de Produto</h1>
    <div class="info">
      <span class="label">Cliente:</span>
      <span class="value" id="clienteNome"></span>
    </div>
    <div class="info">
      <span class="label">Produto:</span>
      <span class="value" id="produtoNome"></span>
    </div>
    <div class="info">
      <span class="label">Preço:</span>
      <span class="value" id="preco"></span>
    </div>
  </div>

  <script>
    // Obtendo os dados da venda do Java e atualizando o HTML
    var clienteNome = document.getElementById('clienteNome');
    var produtoNome = document.getElementById('produtoNome');
    var preco = document.getElementById('preco');

    clienteNome.textContent = '{{ venda.getCliente().getNome() }}';
    produtoNome.textContent = '{{ venda.getProduto().getNome() }}';
    preco.textContent = '{{ venda.getPreco() }}';
  </script>
</body>
</html>
