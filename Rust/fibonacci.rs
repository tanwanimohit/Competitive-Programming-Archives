use std::io;
use std::io::prelude::*; 

fn main() {
    print!("Enter the amount of numbers to generate Fibonacci sequence: ");
    io::stdout().flush().unwrap();
    let mut amount = String::new();

    io::stdin().read_line(&mut amount)
        .expect("Fail to read line!");

    let amount: u32 = amount.trim().parse()
        .expect("Please, enter a number!");

    for i in 0 .. amount {
        print!("{}  ", fibonacci(i + 1));
    }
}

fn fibonacci(num: u32) -> u32 {
    match num {
        1 => 1,
        2 => 1,
        _ => fibonacci(num - 1) + fibonacci(num - 2)
    }
}
