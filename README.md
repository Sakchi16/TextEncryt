# TextEncrypt
This project demonstrates a basic text encryption technique known as the Caesar cipher. The program takes a plaintext input from the user, along with a specified shift value, and applies the Caesar cipher to encrypt the text. The Caesar cipher works by shifting each letter in the plaintext by a certain number of positions in the alphabet. Non-letter characters (such as spaces, punctuation, and numbers) are not altered during the encryption process.

The program is implemented in Java, using a simple console-based interface where the user enters the text to be encrypted and the shift value. The encrypted text is then outputted to the console. This project serves as an introductory example of classical encryption techniques, specifically the Caesar cipher.

Key Features
Caesar Cipher Encryption: The main encryption technique used is the Caesar cipher, where each letter in the plaintext is shifted by a given number (the shift value).
User Input: The program prompts the user to enter the plaintext (the message to be encrypted) and a shift value, which determines how many positions each letter will be shifted in the alphabet.
Preserves Non-Letters: Spaces, punctuation marks, and other non-alphabetic characters are left unchanged during the encryption process.
Simple Implementation: The encryption algorithm is straightforward and serves as a good introduction to the concept of symmetric encryption.

How It Works
Enter Plaintext: The user is asked to input the text they want to encrypt. This can be any string of characters, including spaces and punctuation marks.
Enter Shift Value: The user provides an integer shift value. This value determines how many positions each letter of the plaintext will be shifted in the alphabet. For example, a shift value of 3 will turn 'A' into 'D', 'B' into 'E', etc.
Encrypting the Text: The program loops through each character of the plaintext:
If the character is a letter (either uppercase or lowercase), it is shifted by the given shift value.
If the character is not a letter (such as a space or punctuation mark), it remains unchanged.
Output the Encrypted Text: Once the entire text has been processed, the program outputs the encrypted message to the user.

Example Workflow
Enter the Text: The user types in "Hello, World!" as the plaintext.
Enter the Shift Value: The user enters a shift value of 3.
Encrypted Output: The program encrypts the plaintext by shifting each letter by 3 positions. The result will be "Khoor, Zruog!".
Result Displayed: The encrypted text is displayed on the console.
