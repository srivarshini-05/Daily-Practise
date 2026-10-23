def reverse_between_vowels(s):
    vowels = "aeiouAEIOU"
    s = list(s)  # Convert to list for easy modification

    # Find positions of vowels
    vowel_indices = [i for i, ch in enumerate(s) if ch in vowels]

    # Reverse characters between each pair of vowels
    for i in range(len(vowel_indices) - 1):
        start = vowel_indices[i] + 1
        end = vowel_indices[i + 1]
        s[start:end] = s[start:end][::-1]

    return ''.join(s)

# Input
s = input()
# Output
print(reverse_between_vowels(s))
