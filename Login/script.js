document.addEventListener('DOMContentLoaded', function () {
    var textInput = document.getElementById('textInput');
    var speakButton = document.getElementById('speakButton');

    speakButton.addEventListener('click', function () {
        var textToSpeak = textInput.value;
        speakText(textToSpeak);
    });

    function speakText(text) {
        var utterance = new SpeechSynthesisUtterance(text);
        speechSynthesis.speak(utterance);
    }
});
