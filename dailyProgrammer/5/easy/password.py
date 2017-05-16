credentialsFile = open('credentials.txt', 'r')
credentials = credentialsFile.read().split('|')

password = credentials[1]
password = password[0:len(password)-1]

passInput = input("Please type in password: ")

if passInput == password:
    print("Password entered correctly")
else:
    print("Password entered incorrectly")
