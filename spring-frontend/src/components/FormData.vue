<template>
    <div class="row">
        <div class="col-md-12">
            <form>
                <h1> Sign Up </h1>


                <fieldset>

                    <legend> Your Basic Info</legend>


                    <label for="name">First Name:</label>
                    <input type="text" id="name" name="user_fname" v-model="f_name">

                    <label for="name">Last Name:</label>
                    <input type="text" id="name" name="user_lname" v-model="lname">

                    <label for="email">Email Id:</label>
                    <input type="email" id="mail" name="user_email" v-model="email">

                    <label for="email">Mobile Number:</label>
                    <input type="text" id="mob" name="user_mobile" v-model="mobile">


                </fieldset>
                <fieldset>





                    <label for="job">Job Role:</label>
                    <select id="job" name="user_job" v-model="jobpos">
                        <optgroup label="Web">
                            <option value="frontend_developer">Front-End Developer</option>
                            <option value="php_developer">PHP Developer</option>
                            <option value="python_developer">Python Developer</option>
                            <option value="rails_developer">Rails Developer</option>
                            <option value="web_designer">Web Designer</option>
                            <option value="wordpress_developer">Wordpress Developer</option>
                        </optgroup>

                    </select>

                </fieldset>

                <button v-on:click="addEmployee()">Register</button>

            </form>
        </div>
    </div>


</template>

<script>

import axios from 'axios'
export default {
    name: 'FormData',
    data() {
        return {
            f_name: '',
            lname: '',
            email: '',
            mobile: '',
            jobpos: ''
        }
    },
    props: {
        msg: String
    },
    methods: {
        async addEmployee() {
            // console.log(this.f_name)
            let result = await axios.post("http://localhost:8083/api/createuser", {
                name: this.f_name,
                l_name: this.lname,
                mob_num: this.mobile,
                email_id: this.email,
                job_pos: this.jobpos,
            })
            // console.log(this.jobpos)
            console.warn(result)

            // update employe


        },

    },

}
</script>

<style scoped>
*,
*:before,
*:after {
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
}

body {
    font-family: 'Nunito', sans-serif;
    color: #384047;
}

form {
    max-width: 300px;
    margin: 10px auto;
    padding: 10px 20px;
    background: #f4f7f8;
    border-radius: 8px;
}

h1 {
    margin: 0 0 30px 0;
    text-align: center;
}

input[type="text"],
input[type="password"],
input[type="date"],
input[type="datetime"],
input[type="email"],
input[type="number"],
input[type="search"],
input[type="tel"],
input[type="time"],
input[type="url"],
textarea,
select {
    background: rgba(255, 255, 255, 0.1);
    border: none;
    font-size: 16px;
    height: auto;
    margin: 0;
    outline: 0;
    padding: 15px;
    width: 100%;
    background-color: #e8eeef;
    color: #8a97a0;
    box-shadow: 0 1px 0 rgba(0, 0, 0, 0.03) inset;
    margin-bottom: 30px;
}

input[type="radio"],
input[type="checkbox"] {
    margin: 0 4px 8px 0;
}

select {
    padding: 6px;
    height: 32px;
    border-radius: 2px;
}

button {
    padding: 19px 39px 18px 39px;
    color: #FFF;
    background-color: #4bc970;
    font-size: 18px;
    text-align: center;
    font-style: normal;
    border-radius: 5px;
    width: 100%;
    border: 1px solid #3ac162;
    border-width: 1px 1px 3px;
    box-shadow: 0 -1px 0 rgba(255, 255, 255, 0.1) inset;
    margin-bottom: 10px;
}

fieldset {
    margin-bottom: 3px;
    border: none;
}

legend {
    font-size: 1.8em;
    margin-bottom: 10px;
}

label {
    display: block;
    margin-bottom: 8px;
    font-size: 1.2em;
}

label.light {
    font-weight: 300;
    display: inline;
}

.number {
    background-color: #5fcf80;
    color: #fff;
    height: 30px;
    width: 30px;
    display: inline-block;
    font-size: 0.8em;
    margin-right: 4px;
    line-height: 30px;
    text-align: center;
    text-shadow: 0 1px 0 rgba(255, 255, 255, 0.2);
    border-radius: 100%;
}

@media screen and (min-width: 480px) {

    form {
        max-width: 480px;
    }

}
</style>