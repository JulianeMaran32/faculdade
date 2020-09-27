
matrizCredenciais = [["juliane", "11041988", 0], ["rian", "suzi01", 0]]

usuario = input("Digite seu usuario: ")
senha = input("Digite sua senha: ")

valido = 0

for credencial in matrizCredenciais:
    usuarioCorrente = credencial[0]
    senhaCorrente = credencial[1]

    if usuario == usuarioCorrente and senha == senhaCorrente:
        valido = 1

if valido == 0:
    print("Usuario ou senha invalido!")
else:
    print("Usuario autenticado com sucesso!")
