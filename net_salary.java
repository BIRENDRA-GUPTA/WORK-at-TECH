YPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quick burger</title>
    <link href="https://fonts.googleapis.com/css2?family=Lato:wght@300;400;700&display=swap" rel="stylesheet">
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/CSS/App.css">
</head>

<body>
    <nav class="container mx-auto flex items-center justify-between py-4">
        <div>
<img src="/IMG/logo.jpg" class="w-12" alt="logo">
        </div>
        <div>
            <ul class="flex items-center">
                <li class="ml-6"><a href="#">Menu</a></li>
                <li class="ml-6"><a href="#">Offers</a></li>
                <li class="ml-6"><a href="#">Register</a></li>
                <li class="ml-6"><a href="#">Login</a></li>
                <li class="ml-6"><a href="#" class="inline-block px-4 py-2 rounded-full"><img src="/IMG/cart.png" alt=""></a></li>

            </ul>
        </div>
    </nav>
    <section class="hero py-16">
        <div class="container mx-auto flex items-center justify-between">
            <div class="w-1/2">
                <h6 class="text-lg"><em>Are you hungry?</em></h6>
                <h1 class="text-6xl font-bold">Don't wait !</h1>
                <button class="px-6 py-2 rounded-full text-white font-bold mt-4 bg-green-300">Order Now!</button>
            </div>
            <div class="w-1/2">
                <img src="/IMG/hero-berger.jpg" alt="">
            </div>
        </div>
    </section>
    <section class="menu container mx-auto py-8">
        <h1 class="text-xl text-black font-bold mb-8">All Items</h1>

        <div class="grid grid-cols-4 gap-16"> 

            <div class="w-64 ">
                <img class="h-40 mb-4 mx-auto" src="/IMG/burger.jpg" alt="">
                <div class="text-center">
                    <h2 class="mb-4 text-lg">Chilli burger With Pepper Relish</h2>
                    <span class="size py-1 px-4 rounded-full uppercase text-xs">Veg</span>
                    <div class="flex items-center justify-around mt-6">
                        <span class="font-bold text-lg">80</span>
                        <botton class="add-to-cart py-1 px-6 rounded-full flex items-center font-bold">
                            <span>+</span>
                            <span class="ml-4">Add</span>
                        </botton>
                    </div>
                </div>
            </div>

            <div class="w-64">
                <img class="h-40 mb-4 mx-auto" src="/IMG/v1.jpg" alt="">
                <div class="text-center">
                    <h2 class="mb-4 text-lg">Perfect Lamb Satay Burger</h2>
                    <span class="size py-1 px-4 rounded-full uppercase text-xs">Veg</span>
                    <div class="flex items-center justify-around mt-6">
                        <span class="font-bold text-lg">120</span>
                        <botton class="add-to-cart py-1 px-6 rounded-full flex items-center font-bold">
                            <span>+</span>
                            <span class="ml-4">Add</span>
                        </botton>
                    </div>
                </div>
            </div>

            <div class="w-64">
                <img class="h-40 mb-4 mx-auto" src="/IMG/Burger3.jpg" alt="">
                <div class="text-center">
                    <h2 class="mb-4 text-lg">Supreme Veggie Burger</h2>
                    <span class="size py-1 px-4 rounded-full uppercase text-xs">Veg</span>
                    <div class="flex items-center justify-around mt-6">
                        <span class="font-bold text-lg">100</span>
                        <botton class="add-to-cart py-1 px-6 rounded-full flex items-center font-bold">
                            <span>+</span>
                            <span class="ml-4">Add</span>
                        </botton>
                    </div>
                </div>
            </div>

            <div class="w-64">
                <img class="h-40 mb-4 mx-auto" src="/IMG/v5.jpg" alt="">
                <div class="text-center">
                    <h2 class="mb-4 text-lg">Stuffed Bean Burger</h2>
                    <span class="size py-1 px-4 rounded-full uppercase text-xs">Veg</span>
                    <div class="flex items-center justify-around mt-6">
                        <span class="font-bold text-lg">90</span>
                        <botton class="add-to-cart py-1 px-6 rounded-full flex items-center font-bold">
                            <span>+</span>
                            <span class="ml-4">Add</span>
                        </botton>
                    </div>
                </div>
            </div>

            <div class="w-64">
                <img class="h-40 mb-4 mx-auto" src="/IMG/v6.jpg" alt="">
                <div class="text-center">
                    <h2 class="mb-4 text-lg">Butter Burger</h2>
                    <span class="size py-1 px-4 rounded-full uppercase text-xs">Veg</span>
                    <div class="flex items-center justify-around mt-6">
                        <span class="font-bold text-lg">100</span>
                        <botton class="add-to-cart py-1 px-6 rounded-full flex items-center font-bold">
                            <span>+</span>
                            <span class="ml-4">Add</span>
                        </botton>
                    </div>
                </div>
            </div>

            <div class="w-64">
                <img class="h-40 mb-4 mx-auto" src="/IMG/v7.jpg" alt="">
                <div class="text-center">
                    <h2 class="mb-4 text-lg">Rajma Patty Burger</h2>
                    <span class="size py-1 px-4 rounded-full uppercase text-xs">Veg</span>
                    <div class="flex items-center justify-around mt-6">
                        <span class="font-bold text-lg">150</span>
                        <botton class="add-to-cart py-1 px-6 rounded-full flex items-center font-bold">
                            <span>+</span>
                            <span class="ml-4">Add</span>
                        </botton>
                    </div>
                </div>
            </div>

            <div class="w-64">
                <img class="h-40 mb-4 mx-auto" src="/IMG/v8.jpg" alt="">
                <div class="text-center">
                    <h2 class="mb-4 text-lg">Cheese Burgar</h2>
                    <span class="size py-1 px-4 rounded-full uppercase text-xs">Veg</span>
                    <div class="flex items-center justify-around mt-6">
                        <span class="font-bold text-lg">160</span>
                        <botton class="add-to-cart py-1 px-6 rounded-full flex items-center font-bold">
                            <span>+</span>
                            <span class="ml-4">Add</span>
                        </botton>
                    </div>
                </div>
            </div>

            <div class="w-64">
                <img class="h-40 mb-4 mx-auto" src="/IMG/hero-berger.jpg" alt="">
                <div class="text-center">
                    <h2 class="mb-4 text-lg">Crunchy Chicken Burger</h2>
                    <span class="size py-1 px-4 rounded-full uppercase text-xs">Non-Veg</span>
                    <div class="flex items-center justify-around mt-6">
                        <span class="font-bold text-lg">180</span>
                        <botton class="add-to-cart py-1 px-6 rounded-full flex items-center font-bold">
                            <span>+</span>
                            <span class="ml-4">Add</span>
                        </botton>
                    </div>
                </div>
            </div>

        </div>
    </section>
    <script src="/JS/App.js"></script>
</body>

</html>