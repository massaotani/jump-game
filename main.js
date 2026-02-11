var canJump = (nums) => {
  var pos = 0; //initial position.
  var value = nums[pos]; //quantity of jumps allowed in the current position.

  //a jump means adding a position's value by the current's and checking if it's still inside the array.
  jumpFunction(nums, value, pos);

  // return true;
};

var jumpFunction = (nums, value, pos) => {
  var length = nums.length; //array length.
  var current = nums[pos + value];
  var newPos = pos + value;
  console.log(current);

  nums.length

  if (current != undefined) {
    jumpFunction(nums, current, newPos);
  }

  return;
};

canJump([2, 3, 1, 1, 4]);
