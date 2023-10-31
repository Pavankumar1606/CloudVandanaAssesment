const sentence = prompt('Enter a sentence: ');

function reverse(sentence) {
  let reverse = [];
  for (let word of sentence.split(" ")) {
    reverse.push(word.split("").reverse().join(""));
  }
  return reverse.join(" ");
}

const reverseSentence = reverse(sentence);

console.log(reverseSentence);


/*
Approach:-

Split the input sentence into individual words, using spaces as delimiters.
Reverse the order of letters within each word.
Join the reversed words back together with spaces to form the reversed sentence.
The resulting string is the reversed sentence.*/
