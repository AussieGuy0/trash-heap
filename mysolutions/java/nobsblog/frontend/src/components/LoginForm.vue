<template>
  <div>
    <h1>Login</h1>
    <label>
      Username
      <input v-model="username" type="text">
    </label>
    <label>
      Password
      <input v-model="password" type="password">
    </label>
    <button v-on:click="submit()">submit</button>
  </div>
</template>

<script>
  export default {
    name: 'LoginForm',
    data () {
      return {
        username: '',
        password: '',
        submit: function () {
          const headers = new Headers()
          const credentials = btoa(this.username + ':' + this.password)
          headers.set('authentication', credentials)

          const options = {
            method: 'GET',
            headers: headers
          }

          fetch('/api/v1/auth', options).then(function (response) {
            console.log(response)
            return response.json()
          }.then(function (json) {
            console.log(json)
          }))
        }
      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }
</style>
