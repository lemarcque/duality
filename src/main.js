/**
 * Author : Henoc Sese
 * Description : Testing RxJS
 */

var Rx = require('rxjs/Rx');

// Function

// Pow a number n
// x : input number
// e : exponent
// n : number (result)
var pow = function(x, e){
	let n = x;
	for(i = 0; i < e; i++) {
		n *= x;
	}
	return n;
}


var sourceA = Rx.Observable.of(1,2,3); // etc
var sourceB = Rx.Observable
				.of(1,2,3)
				.map((x) => pow(x, 2));

sourceB.subscribe(result => console.log("Number (powed) : " + result));

// Creates an observable sequence of 5 integers, starting from 1
var source = Rx.Observable.range(1, 5);

// Prints out each item
var subscription = source.subscribe(
  x => console.log('onNext: %s', x),
  e => console.log('onError: %s', e),
  () => console.log('onCompleted'));

// => onNext: 1
// => onNext: 2
// => onNext: 3
// => onNext: 4
// => onNext: 5
// => onCompleted