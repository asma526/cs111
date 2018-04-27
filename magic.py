import random

question = input("Ask and you shall receive: ")

answers = ["Not so sure", "Most likely", "Absolutely not", "Outlook is good", "I see good things happening", "Never",
"Negative", "Could be", "Unclear, ask again", "Yes", "No", "Possible, but not probable"]

print(random.choice(answers))
