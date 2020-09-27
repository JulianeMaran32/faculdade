import pyrebase

firebaseConfig = {
    "apiKey": "",
    "authDomain": "",
    "databaseURL": "",
    "projectId": "",
    "storageBucket": "",
    "messagingSenderId": "",
    "appId": "",
    "measurementId": ""
  }

firebase = pyrebase.initialize_app(firebaseConfig)
auth = firebase.auth()

email = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx@gmail.com"
senha = "123456"

user = auth.create_user_with_email_and_password(email, senha)
print("Usuário cadastrado com sucesso!")





