input_str = input()

if input_str[0].isupper():
    print(input_str)
else:
    input_str = input_str[0].upper() + input_str[1:]
    print(input_str)